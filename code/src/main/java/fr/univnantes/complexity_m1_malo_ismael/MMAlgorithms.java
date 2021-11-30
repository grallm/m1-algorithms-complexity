package fr.univnantes.complexity_m1_malo_ismael;

import fr.univnantes.complexity_m1_malo_ismael.MMInstance.MMInstance;

public class MMAlgorithms {
    public static int LSA (MMInstance instance) {
        //temps avant de commencer les taches
        int tempsdb = (int) System.currentTimeMillis();
        int machine = 0 ;
        //Parcours toute les taches
        for(int task =0; task < instance.getnbTask(); task++){
            Boolean affecter = false;
           //Affecte une tache a une machine de libre
            while( !affecter ){
                //Si une machine est libre alors on attribue la tache 
                if(instance.getMachine(machine) <= (int) System.currentTimeMillis()){
                    affecter = true;
                    instance.addTaskToMachine(machine, task);
                  //sinon on change de machine
                }else{
                    if(machine < instance.nombreMachines() ){
                        machine ++;
                    }else{
                        machine = 0 ;
                      
                    }
                }
            }
        }
        // Calcule et renvoie temps
        return  (int) System.currentTimeMillis() - tempsdb;
    }

    public static int LPT (MMInstance instance) {
        // Calcule et renvoie temps
        return 10;
    }

    public static int RMA (MMInstance instance) {
        // Calcule et renvoie temps
        return 10;
    }
}
