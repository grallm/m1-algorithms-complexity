package fr.univnantes.complexity_m1_malo_ismael;

import fr.univnantes.complexity_m1_malo_ismael.MMInstance.MMInstance;

public class MMAlgorithms {
    public static int LSA (MMInstance instance) {
        int temps =0;
        int machine = 0 ;
        for(int task =0; task < instance.getnbTask(); task++){
            Boolean affecter = false;
           
            while( !affecter ){
                if(instance.getMachine(machine) <= temps){
                    affecter = true;
                    instance.addTaskToMachine(machine, task);
                    temps++;
                }else{
                    if(machine < instance.nombreMachines() ){
                        machine ++;
                    }else{
                        machine = 0 ;
                        temps++;
                    }
                }
            }
        }
        // Calcule et renvoie temps
        return temps;
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
