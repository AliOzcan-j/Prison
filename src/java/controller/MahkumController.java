package controller;

import dao.MahkumDao;
import entity.Mahkum;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named
@SessionScoped
public class MahkumController implements Serializable{
    private List<Mahkum> mlist;
    private MahkumDao mdao;
    private Mahkum mahkum;
    
    /*public MahkumController() {
        this.mlist=new ArrayList<>();
        mdao=new MahkumDAO();
    }*/
    
    public String create(){
        this.getMdao().insert(this.mahkum);
        return "index";
    }

    public List<Mahkum> getMlist() {
        this.mlist=this.getMdao().getMahkumlist();
        return mlist;
    }

    public void setMlist(List<Mahkum> mlist) {
        this.mlist = mlist;
    }

    public MahkumDao getMdao() {
        if(this.mdao==null){
            this.mdao=new MahkumDao();
        }
        return mdao;
    }

    public void setMdao(MahkumDao mdao) {
        this.mdao = mdao;
    }

    public Mahkum getMahkum() {
        if(this.mahkum==null){
            this.mahkum=new Mahkum();
        }
        return mahkum;
    }

    public void setMahkum(Mahkum mahkum) {
        this.mahkum = mahkum;
    }
    
}
