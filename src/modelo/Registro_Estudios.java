package modelo;
import java.util.ArrayList;
import java.time.LocalDate;
public class Registro_Estudios {
    
    private ArrayList<Estudio> listEstudio = new ArrayList();
    
    public Registro_Estudios(){
    }
    
    public void agregarEstudio(Estudio e){
        this.listEstudio.add(e);
    }
    
    public Factura crearFac(Obra_Social os){
        Factura f1 = new Factura(os);
        for (Estudio x: this.listEstudio) {
            if (x.getPaciente().getObraSocial().getNombre().equals(os.getNombre())) {
                if (!x.isFacturado()) {
                    f1.agregarEstudio(x);
                    f1.setTotal(f1.getTotal() + x.calcularCosto());
                }
            }
        }
        return f1;
    }
    
    public ArrayList<Estudio> estMedico(Medico m){
        ArrayList<Estudio> le = new ArrayList();
        for (Estudio x: this.listEstudio){
            if (x.getMedico().getMatricula() == m.getMatricula()){
                le.add(x);
            }
        }
        return le;
    }
    
    public ArrayList<Estudio> estudiosEntre(LocalDate f1, LocalDate f2){
        ArrayList<Estudio> le = new ArrayList();
        for (Estudio x: this.listEstudio){
            if (x.getFecha().isAfter(f1) && x.getFecha().isBefore(f2)){
                le.add(x);
            }
        }
        return le;
    }
    
    public Medico medicMasEstud(){
        Medico m = new Medico();
        int c = 0;
        for (Estudio x: this.listEstudio){
            Medico mAux = x.getMedico();
            int cAux = 0;
            for (Estudio y: this.listEstudio){
                if(y.getMedico().getMatricula() == mAux.getMatricula()) {
                    cAux++;
                }
            }
            if (cAux > c) {
                m = mAux;
                c = cAux;
            }
        }
        return m;
    }
}
