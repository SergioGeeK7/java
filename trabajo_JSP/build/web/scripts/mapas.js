var map;
function inicio(){
	var propiMapa = {
	  center:new google.maps.LatLng(-23.5000,-46.68589),
	  zoom:10,
	  mapTypeId:google.maps.MapTypeId.ROADMAP
	};
	map=new google.maps.Map(document.getElementById("mapas")
	  ,propiMapa);
          
          google.maps.event.addListener(map, "click", function(evento) {
			   
			   var inputlongi = document.getElementById("longitud");
                           
                           inputlongi.defaultValue= evento.latLng.lng();
                           
                           var inputlatit = document.getElementById("latitud");
                           inputlatit.defaultValue=evento.latLng.lat();
                                
			       inputnombre= document.getElementById("nombre").focus();
                               alert("escriba su nombre aqui");
                               
			     }); 

          
          
}
google.maps.event.addDomListener(window, 'load', inicio);
