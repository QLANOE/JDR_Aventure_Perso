function incrementerTour(){
	document.getElementById("nbTour").innerHTML=parseInt(document.getElementById("nbTour").innerHTML)+1;
}

function resetTour(){
	document.getElementById("nbTour").innerHTML=0;
}

function jetd100(){
	var jet = Math.floor(Math.random() * 100)+1;
	document.getElementById("d100").innerHTML = jet;
}

function Ddegats(){

	var lireD=/(\d+)d(\d+)([+-]\d+)*/;
	var chaine=document.getElementById("degat").value;
	var valeursDe=chaine.match(lireD)

	if(valeursDe==null){
		window.alert("Le format du dé n'est pas bon")
	}else{
		var nbDes=parseInt(valeursDe[1]);
		var nbFace=parseInt(valeursDe[2]);
		if(valeursDe[3]==null){
			var bonus=0;
		}else{
			var bonus=parseInt(valeursDe[3])
		}
		var jet=0;
		for(i=0;i<nbDes;i++){
			jet+=Math.floor(Math.random() * nbFace)+1
		}
		jet+=bonus;
		document.getElementById("valeur-degats").innerHTML = jet
	}
}