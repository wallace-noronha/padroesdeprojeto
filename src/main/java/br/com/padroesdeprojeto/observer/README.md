# Padão Observer

## Define a dependência de um para muitos entre objetos para que quando um objeto mude de estado todos os seus dependentes sejam avisados e atualizados automaticamente
 
 ![Diagrama de classe](https://github.com/wallace-noronha/padroesdeprojeto/blob/master/src/main/java/br/com/padroesdeprojeto/observer/ClassDiagram.png)
 
 
 ### O sujeito e os observadores definem uma relação um para muitos. Os observadores dependem do sujeito de modo que quando o estado do sujeito é alterado os observadores são avisados. Dependendo do estilo de notificação, o observador também pode ser atualizado com os novos valores.