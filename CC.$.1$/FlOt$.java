package CC.$.Q$;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

public interface FlOt$
	extends Num$
{
//	Clas_Rap Class=Init_StRt_Nd(Flot$.class
//		,Clas_Rap.class
//	);/*Dep ?done*/

	@Lin_DclAr
	void FlOt$(float In);

	@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=false)
	default Runnable Bind(float ValU)
	{return ()->{FlOt$(ValU);};}
		@Override @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=false)
		default Runnable[] SIn_PAr()
		{return new Runnable[]{
			Bind(-1),
			Bind(1)};
		}
}