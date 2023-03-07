package TP5;
import java.util.List;
public interface IPersonne {
	public void save(Personne P);
	public void delete(int code);
	public boolean update (Personne P);
	public Personne findById (int code ) ;
	public List <Personne> findAll();
}
