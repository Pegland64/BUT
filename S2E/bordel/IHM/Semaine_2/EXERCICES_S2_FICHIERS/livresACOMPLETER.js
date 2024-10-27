

      let liste = []; // la liste des livres

      // Ajoute a la liste un livre de titre 'titre', dont l'auteur est
      // 'auteur', l'editeur 'editeur', le prix 'prix' et l'image qui
      // l'illustre 'image'
      function ajouter(titre,auteur,editeur,prix,image) {
        let livre = new Livre(
                titre,
                auteur,
                editeur,
                prix,
                image
        );
        liste.push(livre);
      }

      // Constructeur d'un objet 'Livre'  de titre 'titre', dont l'auteur est
      // 'auteur', l'editeur 'editeur', le prix 'prix' et l'image qui
      // l'illustre 'image' avec la possibilit� de l'afficher
      function Livre(titre,auteur,editeur,prix,image) {
				// Attributs
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.prix = prix;
        this.image = image;
				// Methodes
        this.afficher = function() {
          let s = "<table border='1'><tr><td><img src='" + this.image + "'></td>";
          s += "<td><b>" + this.titre + "</b><br>";
          s += "Auteur : " + this.auteur + "<br>";
          s += "Editeur : " + this.editeur + "<br>";
          s += "Prix : " + this.prix + " euros</td></tr></table>";
          document.write(s);
        }
        
      }

      // La methode d'affichage d'un livre
function afficherLivre() {
        for (let i = 0; i < liste.length; i++) {
        liste[i].afficher();
        }
}

// Pour ajouter un livre a la liste, il suffit d'ajouter une instruction
//    ajouter(titre,auteur,editeur,prix,image);
// a la fin du fichier.

ajouter("JavaScript : pr�cis et concis",
        "David Flanagan",
        "O'Reilly",
        "8.00",
        "images/jsprecis.jpg");

ajouter("JavaScript 1.3",
        "Michel Dreyfus",
        "CampuPress",
        "30.34",
        "images/js13.jpg");

ajouter("JavaScript, DHTML et CSS",
        "Dan Barret, Micah Brown, Dan Livingston",
        "CampuPress",
        "22.71",
        "images/jsdhtmlcss.jpg");

ajouter("JavaScript facile",
        "Jean-Pierre Lovinfosse",
        "Marabout",
        "7.50",
        "images/jsfacile.jpg");

ajouter("Maitrisez JavaScript",
        "Paul Wilton",
        "CampuPress",
        "50.16",
        "images/jsmaitrise.jpg");

ajouter("JavaScript Visuel Pro",
        "Kelly Murdock",
        "First Interactive",
        "25.76",
        "images/jsvisuelpro.jpg");

ajouter("JavaScript et VBScript",
        "Benjamin Aumaille",
        "ENI (M�ga+)",
        "22.56",
        "images/jsmega.jpg");

ajouter("Vos premiers pas en JavaScript",
        "Dreyfus",
        "Eyrolles",
        "9.91",
        "images/jspremierspas.jpg");

ajouter("Le Tout en Poche JavaScript",
        "Michael G. Moncur",
        "CampuPress",
        "9.91",
        "images/jstoutenpoche.jpg");

ajouter("JavaScript en action",
        "Bradenbaugh",
        "O'Reilly",
        "38.00",
        "images/jsenaction.jpg");

ajouter("JavaScript : les r�f�rences du programmeur",
        "Jean Engels",
        "Eyrolles",
        "29.73",
        "images/jsrefprog.jpg");

ajouter("300 astuces pour HTML et JavaScript",
        "Lentzner",
        "Eyrolles",
        "19.51",
        "images/jsastuces.jpg");

ajouter("JavaScript pour les nuls",
        "Emily A Vander Veer",
        "First Interactive",
        "21.19",
        "images/jsnuls.jpg");

ajouter("Initiation � JavaScript",
        "Don Gosselin",
        "Eyrolles",
        "29.00",
        "images/jsinitiation.jpg");

ajouter("JavaScript par la pratique",
        "David Thau",
        "Eyrolles",
        "38.00",
        "images/jspratique.jpg");

ajouter("D�marrez avec JavaScript",
        "Martin Pein",
        "Micro Application",
        "20.12",
        "images/jsdemarrez.jpg");
