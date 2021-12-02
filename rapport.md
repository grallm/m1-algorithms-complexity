# Distanciel : Algorithmes Approchés pour deux problèmes d'optimisation : Max-SGC et MIN MAKESPAN #

## 1. Le problème MAX-SGC est un problème d'optimisation. Écrire, sous la forme NOM/INSTANCE/QUESTION le problème de décision associé à MAX-SGC.
    DEC-SGC
    Instance : Un graphe orienté G = (V,A), un entier k.
    Question : Possède t-il un sous-graphe sans circuit avec k sommets?
## 2. Démontrer que DEC-SGC est dans NP.

Certificat : un graphe G' qui est un sous-graphe de G qui ne possède pas de circuit.

Taille des donnée : |G'| est la taille du certificat. Donc la taille du certificat est polynomial.

Vérification : 

- G' possède bien k sommets et qu'ils appartiennent au graphe G => O(n+n²) = O(n)
- G' ne possède pas de circuit O( k + m ) avec m le nombre d'Arc
  
    Ainsi la vérification se fait en temps polynomial.

La taille du certificat et la verification sont polynomiales donc on peut conclure que DEC-SGC est dans NP.


## 3. Appliquer l’algorithme Approx-SGC sur le graphe orienté ci-dessus, en utilisant la numérotation des sommets qui y est indiquée. En particulier, indiquer les contenus de A1, A2 et A′

![Graphe G](img/G.PNG)

### A) Attribution aux hasards des sommets :

La valeur des sommets est deja attribué tel que 1<=p<=n donc on garde cette attribution de G.

### B) Séparation des Arcs dans l'ensemble A1 ou A2.

|   A1   |   A2   |
|--------|--------|
| (1,4)  |  (4,3) |
| (1,7)  |  (7,5) |
| (3,7)  |  (3,2) |
| (2,5)  |  (7,6) |
| (5,8)  |  (6,1) |
|        |  (8,6) |

### C) L'ensemble qui contient le plus d'Arcs est l'ensemble A2 donc A' = A2.

## 4.  Montrer que, quel que soit le graphe orienté G donné en entrée, les arcs de l’ensemble A′ calculé par Approx-SGC ne forment jamais de circuit.



## 5. Approx-SGC est-il polynomial ? Justifier.

- Partie A : O(n)
- Partie B : O(m)
- Partie C : O()

## 6. Proposer un exemple de graphe orienté G à n = 5 sommets pour lequel Approx-SGC ne fournit pas une solution optimale au problème MAX-SGC. Justifier.
## 7. Pour tout graphe orienté G, donner une borne supérieure pour opt(G), qui dépend de m (le nombre d’arcs du graphe). Justifier.
## 8. Pour tout graphe orienté G, donner une borne inférieure pour sol(G), qui dépend aussi de m. Justifier.
## 9. En déduire un ratio d’approximation pour l’algorithme Approx-SGC.
## 10. Quel ratio d’approximation est obtenu par Approx-SGC sur le graphe orienté de la figure ? Justifier.

 