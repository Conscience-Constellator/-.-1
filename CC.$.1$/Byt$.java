package CC.$.Q$;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

public interface Byt$
	extends Num$
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Byt$.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Byt$(byte In);

	@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=false)
	default Runnable Bind(byte ValU)
	{return ()->{Byt$(ValU);};}
		@Override @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=false)
		default Runnable[] SIn_PAr()
		{return new Runnable[]{
			Bind((byte)-1),
			Bind((byte)1)};
		}
}