package Views;

import controllers.EmpleadoController;

public class EmpleadoView {
	
	public static void main(String[] arg) {
		  
		//Crear empleado
		//String empleado= new EmpleadoController().createEmpleado("Rosas", "Celeste", 17,"Femenino", 1500.50);
		//String empleado= new EmpleadoController().createEmpleado("Tello", "Juana", 18,"Femenino", 1800.80);
		String empleado= new EmpleadoController().createEmpleado("Rosales", "Mariano", 20,"Masculino", 2500.70);
        System.out.println(empleado);
		
		
		//Eliminar Empleado
		//String empleado= new EmpleadoController().deleteEmpleado(6);
		//String empleado= new EmpleadoController().deleteEmpleado(8);
		//System.out.println(empleado);
				
		//Buscar Empleado
		//String buscarEmpleado = new EmpleadoController().BuscarEmpleado(7);
		//System.out.println(buscarEmpleado);
		
		
        //Buscar Empleado
      	//String buscarEmpleado = new EmpleadoController().buscarEmpleado(10);
      	//System.out.println(buscarEmpleado);
		
		//Actualizar Empleado
		//String empleado= new EmpleadoController().updateEmpleado(9, "Jimena","Manrique");
		//System.out.println(empleado);
	}
	      

}
