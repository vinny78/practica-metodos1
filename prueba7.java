����   > T
      java/lang/Object <init> ()V
  	 
   java/lang/Math sqrt (D)D  java/util/Scanner	      java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;  #introduce numeros mayor o igual a 0
    ! " # java/io/PrintStream println (Ljava/lang/String;)V
  % & ' nextInt ()I
 ) * + , - prueba7 esPrimo (I)Z   / 0 1 makeConcatWithConstants (I)Ljava/lang/String; 3 no es primo Code LineNumberTable LocalVariableTable this 	Lprueba7; i I num2 StackMapTable main ([Ljava/lang/String;)V args [Ljava/lang/String; Ljava/util/Scanner; num 
SourceFile prueba7.java BootstrapMethods G
 H I J 0 K $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; M  es primo  InnerClasses P %java/lang/invoke/MethodHandles$Lookup R java/lang/invoke/MethodHandles Lookup ! )           4   /     *� �    5        6        7 8   	 , -  4   �     $� �<��� �� p� ������    5             	  
   "  6     	  9 :    $ ; :   <    � �  	 = >  4   �     7� Y� � L� � +� $=� (� � � .  � � � 2� �    5                .  6  6        7 ? @    ,  A    B :  <   
 � .   C    D E     F  L N   
  O Q S 