/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi2;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeison  Nisperuza
 */
import java.awt.*;
import java.applet.*;

public class Hanoi2 extends Applet {

static final int XDOTS = 400;
static final int YDOTS = 200;
static final int NULL = -1;
static final int MAX = 20;
static final int MIN = 3;
static final int MAXCOLS = 6;
static final int MINCOLS = 3;
static final Color cfondo=new Color(228,233,243);
static final Color cbarra=Color.black;
static final Color cfin =Color.red;
static final Color ctorre=Color.blue;
boolean first=true;
int origen,destino;
int movimientos;
int h[] = new int[MAXCOLS];
int Ficha[][] = new int[MAXCOLS][MAX];
int Centorr[] = new int[MAXCOLS];
Button B[] = new Button[MAXCOLS];
TextField TFTorres, TFCols, TFMovimientos;
int numtorres=5, numcols=3;

void Parametros() {

String param;
param = getParameter("TORRES");
    if (param != null) numtorres = Integer.parseInt(param);
        param = getParameter("COLS");
            if (param != null) numcols = Integer.parseInt(param);
}

public void init() {

int i;
setBackground(cfondo);
resize(XDOTS,YDOTS);

    if (first) {
        Parametros();
        Herramientas();
        first=false;
}

for (i=0; i< MAXCOLS; i++)
    if (i< numcols) B[i].enable();
   else B[i].disable();
        for (i=0; i< numcols; i++)
            Centorr[i]=(XDOTS/(numcols+1))*(i+1);
            h[0]=numtorres;
                    for (i=1; i< numcols; i++)
                        h[i]=0;
                            for (i=0; i< numtorres; i++)
                                Ficha[0][i]=numtorres-i;
                                movimientos=0;
                                origen=destino=NULL;
}

public void Herramientas() {

setLayout(new BorderLayout());
Panel p= new Panel();
p.setBackground(cfondo);
    for (int i=0; i< MAXCOLS; i++)
        p.add(B[i]=new Button(Integer.toString(i+1)));
        p.add(new Button("Cancelar"));
        p.add(new Button("Resolver"));
        p.add(new Button("Nueva"));
        add("South",p);
        Panel g= new Panel();
        g.setBackground(cfondo);
        g.add(new Label("Columnas"));
        g.add(TFCols= new TextField(Integer.toString(numcols)));
        g.add(new Label("Torres"));
        g.add(TFTorres=new TextField(Integer.toString(numtorres)));
        g.add(new Label("Movimientos"));
        TFMovimientos=new TextField("0",8);
        TFMovimientos.disable();
        g.add(TFMovimientos);
        add("North",g);

}

public void Dibujar_Torres (Graphics g, Color coltorr) {

int x,y, Long;
int l,k;
int anchomin=(Centorr[1]-Centorr[0])/numtorres;
int altotorre=(YDOTS-85)/numtorres;
g.setColor(cbarra);
    for (k=0; k< numcols; k++)
        g.fillRect(Centorr[k]-1, 35, 2, YDOTS-75);
        g.setColor(coltorr);
            for (k=0; k< numcols; k++)
                for (l=0; l< h[k]; l++) {
                        Long=anchomin*Ficha[k][l];
                        x=(Centorr[k]-(Long/2));
                        y=YDOTS-60-l*altotorre;
                        g.fillRect(x,y,Long,altotorre-altotorre/3);
              }

}

public void paint(Graphics g) {

Dibujar_Torres(g, ctorre);
TFMovimientos.setText(Integer.toString(movimientos));
for (int i=1; i< numcols; i++)
if (h[i]==numtorres) Final();

}

public void Final() {

Dibujar_Torres(getGraphics(), cfin);

}

boolean valido(int origen, int destino) {

if (origen==NULL || destino==NULL || origen==destino) return false;
if (h[origen]==0) return false;
if (h[destino]==0) return true;
if (Ficha[destino][h[destino]-1]< Ficha[origen][h[origen]-1]) return false;
return true;

}

public void Resolver() {

Mover(numtorres,0,1,numcols-1);
}

void Desplazar(int origen, int destino) {

h[origen]--;
Ficha[destino][h[destino]]=Ficha[origen][h[origen]];
h[destino]++;
movimientos++;
}

void Mover(int Numero, int Comienzo, int Auxiliar, int Final)

{

int varaux;
for (int i=Numero; i>0; i--) {
    //----------------------------
       //esperar para que los movimientos se vean con claridad
	try {
	  Thread.sleep(1000);
        } catch(InterruptedException e) {
	     //g.drawString("Error en sleep", 100, 100);
  }
//--------------------------------
        Mover(i-1,Comienzo,Final,Auxiliar);
        Desplazar(Comienzo,Final);
        update(getGraphics());
        varaux=Comienzo;
        Comienzo=Auxiliar;
        Auxiliar=varaux;

    }
}

public boolean action(Event e, Object o) {

if (e.target instanceof Button) {
int i;
for (i=0 ; i< numcols; i++)
    if ((Integer.toString(i+1)).equals(e.arg)) {
        if (origen==NULL) {
            origen=i;
            B[origen].disable();
        }
    else {
        destino=i;
            for (i=0; i< numcols; i++)
                B[i].enable();
      }
    break;
   }

if( "Nueva".equals(e.arg) || "Resolver".equals(e.arg)) {

numtorres=Integer.parseInt(TFTorres.getText());
numcols =Integer.parseInt(TFCols.getText());
    if (numtorres< MIN) numtorres=MIN;
        else if (numtorres>MAX) numtorres=MAX;
            if (numcols< MINCOLS) numcols=MINCOLS;
                else if (numcols>MAXCOLS) numcols=MAXCOLS;
            TFTorres.setText(Integer.toString(numtorres));
            TFCols.setText(Integer.toString(numcols));
            TFMovimientos.setText("0");
            init();
}

  if( "Cancelar".equals(e.arg)) {
    origen=destino=NULL;
        for (i=0; i< numcols; i++)
            B[i].enable();
    }

    if( "Resolver".equals(e.arg)) Resolver();

        if (valido(origen,destino)) {
                Desplazar(origen,destino);
                origen=destino=NULL;
        }

   repaint();
   return true;
  }
return false;
}

public String getAppletInfo() {
    return "Nombre : Torres de Hanoi\r\n" +
    "Autor : Manuel Barrera \r\n" +
    "e-mail : mbarrera@inf.uach.cl.\r\n";
    }

}