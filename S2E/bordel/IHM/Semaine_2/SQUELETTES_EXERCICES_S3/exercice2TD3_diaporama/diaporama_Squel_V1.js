
      'use strict'
      
      // sources[i] est le nom du fichier image de l'image numero i
      let sources = new Array('diapo1.jpg','diapo2.jpg','diapo3.jpg','diapo4.jpg','diapo5.jpg','diapo6.jpg','diapo7.jpg','diapo8.jpg','diapo9.jpg','diapo10.jpg');

      let ind_im_cour=0; //indice de l'image courante
	  

	// Affiche l'image suivant l'image courante
	function suivante(){
            ind_im_cour = (ind_im_cour + 1) % sources.length;
            document.getElementById('photo').src = sources[ind_im_cour];
	}

      let image = document.getElementById('photo');
      image.onclick = (event) => {
            suivante();
      }