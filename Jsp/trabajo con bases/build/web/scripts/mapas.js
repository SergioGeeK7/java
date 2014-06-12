var varMapId;
var varPosicion=new google.maps.LatLng(-23.5000,-46.68589);

function inicio(){
	var varCentMapa = {
		  center:varPosicion,
		  zoom:8,
		  mapTypeId:google.maps.MapTypeId.ROADMAP
	  };

	  varMapId = new google.maps.Map(document.getElementById("mapas"),varCentMapa);

	  google.maps.event.addListener(varMapId, 'click', function(event) {
			lugarMarcado(event.latLng);
	  });
}

function lugarMarcado(localizacion) {
	document.getElementById("latitud").value = localizacion.lat();
        document.getElementById("longitud").value = localizacion.lng();
        }
google.maps.event.addDomListener(window, 'load', inicio);


