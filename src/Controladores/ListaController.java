
package Controladores;

import Modelos.Clientes;
import Modelos.ListaModel;
import Vistas.frmListas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;



    public class ListaController implements ActionListener{
        frmListas VistaLista;
       ListaModel ModeloLista;

    public ListaController(frmListas VistaLista, ListaModel ModeloLista) {
        this.VistaLista = VistaLista;
        this.ModeloLista = ModeloLista;
        
        this.VistaLista.btnAtenderCliente.addActionListener(this);
        this.VistaLista.btnAtendertodo.addActionListener(this);
        this.VistaLista.btnIngresarCliente.addActionListener(this);
        
        //levantar la vista
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
        
    }
       
       //escucha a los botones
    
        
        @Override
        
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==this.VistaLista.btnIngresarCliente)
            {
                this.ModeloLista.EncolarCliente(this.VistaLista.txtApellidos.getText(), 
                        this.VistaLista.txtNombre.getText());
                
                //traer a la vista los clientes
                Queue<Clientes> ListaLocal = this.ModeloLista.ListarClientes();
                
                //recorre la lista y asigna el text area
                String Cadena = " ";
                for(Clientes MiListaClientes: ListaLocal)
                   
                
                {
                    Cadena = Cadena + MiListaClientes.getApellidos()+" "+MiListaClientes.getNombres()+"\n";
              this.VistaLista.txtListaClientes.setText(Cadena);
                }
               
            
        }
            
                
            }
        
            
        }
            
            
                
            

