import java.util.Arrays;



public class MainABR {
    public static void main(String[] args) {
    	final int N =10;
        ABR<Integer> arbre = new ABR<Integer>();
        /*Cas 1 : Les clés sont ajouter en ordre */
	     
    	long debutAjout = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arbre.add(i);
         }
        
	       long finAjout=System.currentTimeMillis();
	       long TempExecutionAjout = finAjout - debutAjout;
	       System.out.println("Temps d'execution d'ajout de "+N+" clés en ordre est :"+TempExecutionAjout+" milisecondes ");
	   
	       /*Cas 2 :  les clefs sont ajoutées en ordre aléatoire*/
	      long debutAjoutAleatoire = System.currentTimeMillis();
	        for (int i = 0; i < N; i++) {
	        	 Integer element = (int) (Math.random() * N);
	             arbre.add(element);
	         }
	        
		       long finAjoutAleatoire=System.currentTimeMillis();
		       long TempExecutionAjoutAleatoire = finAjoutAleatoire - debutAjoutAleatoire;
		       System.out.println("Temps d'execution d'ajout aléatoire de "+N+" clés en ordre est :"+TempExecutionAjoutAleatoire+" milisecondes ");
		       
		       /*Recherche de 2N*/
		       long debutRecherche = System.currentTimeMillis();
		        for (int i = 0; i < 2*N-1; i++) {
		       arbre.contains(i);
		         }
		        
			    long finRecherche=System.currentTimeMillis();
			    long TempExecutionRecherche = finRecherche - debutRecherche;
			       System.out.println("Temps d'execution de recheche de "+N+" clés en ordre est :"+TempExecutionRecherche+" milisecondes ");
			       
		       
	       
        //affichage 
        System.out.println(arbre);
       
        arbre.clear();
        System.out.println("l'arbre est vide :"+arbre.isEmpty());
   
    }
}
