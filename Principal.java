package BodegaListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nombre="";
        String codigoBarras="";
        double precio=0.0;
        int existencia=0;
        int flag=0;
        Scanner sc=null;

        List<Articulos> list=new ArrayList<Articulos>();
        List<Articulos> articulosrelacionados=new ArrayList<Articulos>();
        //Articulos art= new Articulos(nombre, codigoBarras, precio, existencia);
        do{

            System.out.println("Bienvenidos a la bodega");
            System.out.println("1. Agregar nuevo articulo");
            System.out.println("2. Editar datos de un articulo");
            System.out.println("3. Buscar un articulo por codigo de barras");
            System.out.println("4. Elimar un articulo");
            System.out.println("5. Buscar articulos por nombre");
            System.out.println("6. mostrar una lista de los articulos disponibles");
            System.out.println("7. Salir");
            System.out.println("Selecciona una opción");
            sc=new Scanner(System.in);
            flag=sc.nextInt();
            switch(flag){
                case 1:
                    //agregar
                    System.out.println("Ingresa un articulo:");
                    sc=new Scanner(System.in);
                    nombre=sc.nextLine();

                    System.out.println("Ingresa codigo de Barras:");
                    sc=new Scanner(System.in);
                    codigoBarras=sc.nextLine();

                    System.out.println("Ingresa el  precio:");
                    sc=new Scanner(System.in);
                    precio=sc.nextDouble();

                    System.out.println("Ingresa las unidades disponibles:");
                    sc=new Scanner(System.in);
                    existencia=sc.nextInt();

                    Articulos art= new Articulos(nombre, codigoBarras, precio, existencia);
                    list.add(art);

                    
                break;
                case 2:
                    System.out.println("Ingresa un articulo:");
                    sc=new Scanner(System.in);
                    nombre=sc.nextLine();
                    //recorrer la lista para encontrar el objeto deseado
                    for (Articulos a : list) {
                        if(a.getNombre().equals(nombre)){
                            //Actualizacion de los datos
                            System.out.println("Ingresa el  nombre:");
                            sc=new Scanner(System.in);
                            nombre=sc.nextLine();

                            System.out.println("Ingresa codigo de barras:");
                            sc=new Scanner(System.in);
                            codigoBarras=sc.nextLine();

                            System.out.println("Ingresa el  precio:");
                            sc=new Scanner(System.in);
                            precio=sc.nextDouble();

                            System.out.println("Ingresa numero de unidades:");
                            sc=new Scanner(System.in);
                            existencia=sc.nextInt();

                            a.setNombre(nombre);
                            a.setCodigoBarras(codigoBarras);
                            a.setPrecio(precio);
                            a.setExistencia(existencia);
                        }
                    }
                break;
                case 3:
                    System.out.println("Ingresa el codigo de barras buscado:");
                    sc=new Scanner(System.in);
                    codigoBarras=sc.nextLine();

                    for (Articulos a : list) {
                        if(a.getCodigoBarras().equals(codigoBarras)){
                            System.out.println(a);
                            
                        }
                    }

                break;
                case 4:
                    System.out.println("Ingresa el articulo a eliminar:");
                    sc=new Scanner(System.in);
                    nombre=sc.nextLine();

                    int indice=0;

                    for (Articulos a : list) {
                        
                        if(a.getNombre().equals(nombre)){
                            list.remove(indice);
                            System.out.println("articulo eliminado");

                            break;//para evitar hacer iteraciones innnecesarias
                        }
                        indice++;
                    }

                break;
                case 5:
                    System.out.println("Ingresa el nombre del articulo:");
                    sc=new Scanner(System.in);
                    nombre=sc.nextLine();
                    //Recorre la lista de carros
                    for (Articulos a : list) {
                        if(a.getNombre().equals(nombre)){
                            articulosrelacionados.add(a);
                        }
                    }
                    System.out.println(articulosrelacionados.toString());
                    articulosrelacionados.clear();

                break;
                case 6:
                    System.out.println(list.toString());
                break;
            }
        }while(flag!=7);
    }
}
