class Tri{

    /**
     * effectue un tri par selection
     * repeter
     * <li> (1) - selectionner plus petit element apres i
     * <li> (2) - le mettre a la place i (en debut des elements)
     *
     * @param tab tableau a trier, modifie ordre des elements du tableau
     */
    public void trier(int[] tab) {
        // repete plusieurs fois (jusqu'au tri)
        for (int i=0; i < tab.length - 1; i++) {

            // on cherche le plus petit element a partir de i
            indicemin = i;
            int min = tab[i];
            for (int j=i;j< tab.length -1;j++) {
                if (tab[j]<min)
                    min = tab[j];
            }

            // le met au debut
            tab[i] = min;
        }
    }

}