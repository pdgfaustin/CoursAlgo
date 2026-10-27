# Algorithme et Structures de Données
Un Algorithme est une suite d’étapes logiques et finies permettant de résoudre un problème. Un bon algorithme est caractérisé par :
#### - La précision : chaque étape doit être claire ;
#### - La non ambigüité : un algorithme est destiné à toujours donner un résultat ;
#### - La finition : il se termine après un nombre limité d’opérations ;
#### - L’efficacité : il résout le problème rapidement et avec peu de ressources.
Une structure de données est une manière d’organiser, stocker et manipuler les données pour faciliter leur utilisation. Chaque structure choisie détermine la rapidité d’un algorithme.
Voici les structures de données fondamentales :
## a. Les tableaux (Arrays)
C’est une structure de données fondamentale qui organise une collection finie d’éléments (souvent de même type) dans un espace mémoire côte à côte pour faciliter l’accès direct, cet’ accès est rapide pour le simple fait que chaque élément est associé à un indice numérique appelé index qui commence souvent par zéro (0).
Dans de nombreux langage de programmation, tous les éléments doivent être du même type, alors que la taille du tableau est définie à sa création bien que des techniques permettent de simuler des tableaux dynamiques.
## b. Liste chainées (Linked Lists)
Une liste chaînée est une structure de données dynamique composée de cellules (ou nœuds) reliées par des pointeurs, où chaque cellule contient une donnée et l'adresse du nœud suivant, permettant une taille flexible et des insertions/suppressions efficaces, contrairement aux tableaux à taille fixe. Il existe plusieurs types comme : 
#### - Les listes simplement chaînées (pointeur vers le suivant)
#### -	Doublement chaînées (pointeurs précédant et suivant)
#### -	 Circulaires (le dernier pointe vers le premier) 
Chaque liste chaînée a pour caractéristiques :
#### •	Eléments reliés par des pointeurs ;
#### •	Insertion et suppression rapides ;
#### •	Accès séquentiel (lent pour accéder à la position n)
C’est très utile pour les listes dynamiques et les mémoires fragmentées.
## c. Les Piles (stacks) : LIFO = Last In, First Out
Une pile (Stack) est une structure de données linéaire qui suit le principe LIFO (Last In, First Out), où le dernier élément ajouté est le premier à être retiré, comme des assiettes superposées. Les opérations clés sont Empiler (Push), qui ajoute un élément au sommet, et Dépiler (Pop), qui le retire, ne permettant l'accès qu'au sommet. Elles sont utilisées pour l'annulation d'actions, l'historique de navigation ou la gestion des appels de fonctions.
Donc :
#### -	On ajoute / enlève toujours en haut
Exemple : Ctrl + Z
#### -	Deux opérations possibles : push()  empiler et pop()  dépiler
## d.	Files (Queues)
Une file (queue) est une structure de données linéaire qui suit le principe FIFO (First-In, First-Out, Premier Entré, Premier Sorti), similaire à une file d'attente réelle, où le premier élément ajouté est le premier à être retiré. Les opérations clés sont enfiler (ajouter à la fin), défiler (retirer du début), et vérifier si elle est vide. Les files sont cruciales pour la gestion des tâches, les systèmes d'ordonnancement, les tampons (buffers) et les algorithmes de parcours de graphes.
Donc : 
#### -	On ajoute à la fin : enfiler et on retire au début : défiler.
Exemple :
#### -	File d’attente pour retrait d’argent à l’agence
#### -	File d’attente imprimante
#### -	Gestion des processus CPU
## e.	Arbres (Trees)
Les arbres sont des structures de données hiérarchiques non linéaires, composées de nœuds reliés par des arêtes, partant d'un unique nœud appelé racine. Ils organisent les données de manière parente-enfant, avec des nœuds sans enfant appelés feuilles, et sont fondamentaux pour représenter des hiérarchies (fichiers, expressions) ou optimiser des recherches (arbres binaires de recherche).
Donc : un arbre est une structure hiérarchique très utilisée dans les systèmes de fichiers, arbres de décision, et aussi les bases SQL.
## f.	Graphes
La structure de données des graphes modélise des ensembles d'éléments (sommets/nœuds) et les relations qui les lient (arêtes/arcs), formant ainsi des réseaux complexes utilisés pour représenter des cartes routières (GPS), des réseaux sociaux, le web, etc. Ils se distinguent par leur nature non linéaire (contrairement aux listes) et peuvent être orientés (sens unique), non orientés (symétriques) ou pondérés (avec coûts/distances). L'implémentation se fait souvent via des matrices d'adjacence ou des listes d'adjacence, essentiels pour des algorithmes de recherche de chemins (comme Moore ou Dijkstra).
Donc : un graphe = ensemble de nœuds + liens (orientés ou non)
Exemple :
#### -	Réseaux sociaux
#### -	Cartes routières
#### -	Réseaux électriques
