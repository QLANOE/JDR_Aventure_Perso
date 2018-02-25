

function Lancer(){

	var nbDes=document.getElementById("nbDe").value;
	var diff=document.getElementById("difficulte").value;
	document.getElementById("resultatLancer").innerHTML =""

	var jet=[];
	for(i=0;i<nbDes;i++){
		jet[i]=Math.floor(Math.random() * 10)+1
	}

	var comparator = function(a,b){
   return a>b ;
	}
	jet=tri(jet,comparator)
	document.getElementById("resultatLancer").innerHTML = jet
	calculReussite(jet,diff)
}

 

function tri(jet,comparator){
    for(var i= 0 ; i< jet.length; i++){ 
    // le tableau est trié de 0 à i-1
    // La boucle interne recherche le maximum  
    // de i+1 à la fin du tableau. 
        for(var j=i+1; j< jet.length; j++){
               if(comparator( jet[j], jet[i]) ){
                   var temp = jet[j];
                   jet[j]=jet[i];
                   jet[i]=temp;
                }
        }
    }
    return jet ;
}

function calculReussite(jet,diff){

	var nbReussite=0;
	var nbEchec=0;
	for(i=0;i<jet.length;i++){
		if(jet[i]==1){
			nbEchec++
		}
		if(jet[i]==10){
			nbReussite+=2
		}if(jet[i]!=10 && jet[i]>=diff){
			nbReussite++
		}
	}
	if(nbReussite==0 && nbEchec>0){
		document.getElementById("reussite").innerHTML = "Echec critique"
		document.getElementById("reussite").style.color = "red";
	}else if(nbEchec<nbReussite && nbReussite!=0){
		document.getElementById("reussite").innerHTML = "Réussi avec "+(nbReussite-nbEchec)+" réussite"
		document.getElementById("reussite").style.color = "green";
	}else{
		document.getElementById("reussite").innerHTML = "Echec"
		document.getElementById("reussite").style.color = "black";
	}
	

	document.getElementById("test").innerHTML = "Réussite "+nbReussite +" échec "+nbEchec

}