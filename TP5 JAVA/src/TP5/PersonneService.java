package TP5;
import java.util.ArrayList;
import java.util.List;
public class PersonneService implements IPersonne{
	private ArrayList <Personne> listPers ;
	public PersonneService (ArrayList ListPers) {
		this.listPers=ListPers;
	}
	@Override
	public void save(Personne P) {
		listPers.add(P);
	}

	@Override
	public void delete(int code) {
		for (int i = 0 ; i<listPers.size() ; i++) {
			if (listPers.get(i).getCode()==code) {
				listPers.remove(i);
			}
		}
	}

	@Override
	public boolean update(Personne P) {
		if (listPers.contains(P)==false) {
			return false ;
		}
		else {int i = listPers.indexOf(P);
				listPers.get(i).setCode(132);
				listPers.get(i).setNom("soussane");
				listPers.get(i).setPrenom("khalil");
		}
			return true ;
	}

	@Override
	public Personne findById(int code) {
		for (int i = 0 ; i<listPers.size() ; i++) {
			if (listPers.get(i).getCode()==code) {
				return listPers.get(i); 
			}
		}
		return null;	
	}

	@Override
	public List<Personne> findAll() {
		return listPers ;
	}
	
}
