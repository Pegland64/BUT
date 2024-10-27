//q2

fonction lCyclisteImprimer3apres (lcycliste:liste(chaine),nomCycliste : chaine)
    debut
        compteur<-3
        trouver<-faux
        place<-tête(lCycliste)
        tant que non finliste(lcycliste,place) et compteur>0 faire
            nom <-val(lcycliste,place)
            si trouver
                alors compteur<- compteur-1
                écrire (nom)
            sinonsi nomcycliste = nom dans trouver <- vrai
            fsi
            place<-suc(lCycliste,place)
        ftant
        si non trouver alors
            ecrire("pas trouvé")
    fin

//q2.7

fonction lEntierCréer():Liste (entier)
    debut
        lEntier <-lisvide()
        nb Valeur <- lire()
        pour i de 1 à nbValeur faire
            valeur <- lire()
            p<- tête (lEntier)
            trouvé <- faux
            dépassé <- faux
            tant que non finaliste (lEntier,p) et non trouvé et non dépassé faire
                si valeur = val(lEntier, p) alors
                    trouvé <- vrai
                sinon si valeur < val(Entier,p)alors
                    dépassé <- vrai
                sinon
                    p_prec <- p
                    p<-suc(lEntier, p)
                fin si
            fin tant que 
            si trouvé alors
                suplis(lEntier, p)
            sinon si nondépassé alors
                adjqlis(lEntier,valeur)
            sinon
                adjlis (lEntier, p, val(lEntier,p))
                chglis(lEntier, p, valeur)
            fsi
        fpour
        retourner lEntier
    fin

//q2.8
Algorithme lEntierInterclasser(l1  : Liste, l2 : Liste)
    resultat = ListeVide()

    i = 1
    j = 1

    tant que fin l1 = faux et fin l2 = faux:
        si l1[i] <= l2[j]:
            ajouter l1[i] à resultat
            i = i + 1
        sinon:
            ajouter l2[j] à resultat
            j = j + 1

    retourner resultat

//2.9
fonction finliste (l liste (Valeur), p: place) : boolean
debut
    retourne (p>liste.nb)
fin

fonction adjlis (l liste(valeur), v valeur)
debut
    place_libre <- ~~~~~~~~~~~~~~
    l.tab[place.libre].val = v
    l.tab[place.libre].suc = ltete
    l.tete = place.libre
fin


fonction lEtudChqercherElement (lEtud:liste Etudiant nom : chaine) Place

debut
place <- tete(lEtud)
trouve <- faux
    tant que non trouvé et non finliste(lEtud,PLace) faire
        si val lEtud, Place.nom = nom alors
            trouvé <- vrai 
        sinon  
            place <- suc (lEtude, place)
        fin si
    ftant
    retourne place
fin

3.3)
fonction polynomecalculervaleur (p:polynome, x : réel) : reel
debut
    pl <- tete(polynome)
    resultat <-0
    tant que non finliste (p,pl) faire
        n <- val (p,pl)
        resultat <- résultat + (n.coeff x puissance entiere calculer (x, n.exp))
        pl <- suc(p,pl)
    fintant
    retourne résultat
fin

fonction polynomeaddition (p1 : polynome, p2 : polynome) : polynome
debut 
    pl1 <- tete(p1)
    pl2 <- tete(p2)
    ps <- lisvide()
    tant que non finliste (p1, pl1) et non finliste (p2,pl2)faire
        n1 <- val (p1,pl1)
        n2 <- val (p2,pl2)
            si n1.exp = n2.exp alors
                ns.coeff <- n1.coeff + n2.coeff
                ns.exp <- n1.exp
                si  ns.coeff != alors adjqlis (ps,ns)finsi
                pl1 <- suc(p1, pl1)
                pl2 <- suc(p2, pl2)
                sinon si m1.exp != m2.exp alors
                si m1.exp > m2.exp alors
                    adjqlis(ps,m1)
                    pl1<-- suc(p1, pl1)
                sinon 
                    adjqlis(ps, m2)
                    pl2 <-- suc(p2, pl2)
                fsi
            fsi
        ftantque
        tant que non  finliste(p1,pl1) faire
            adjqlis(ps, val(p1,pl1))
            pl1<-- suc(p1,pl1)
        ftantque
        tant que non  finliste(p2,pl2) faire
            adjqlis(ps, val(p2,pl2))
            pl2<-- suc(p2,pl2)
        ftantque
            retourne ps
    fin

fonction jeuDeLaBataille(cartes 1 : file(Carte), cartes 2:File(Carte)): boolean
début
    
    retourne nom_variable
fin