package CC.$.Q$;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

public interface Bool$ extends Q$
{
//	Clas_Rap Class=Init_StRt_Nd(Bool$.class
//		,Clas_Rap.class
//	);/*Dep ?done*/

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Bool$(boolean Bool);

	@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=false)
	default Runnable Bind(boolean ValU)
	{return ()->{Bool$(ValU);};}
		@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=false)
		default Runnable[] Bool_PAr()
		{return new Runnable[]{
			Bind(false),
			Bind(true)};
		}
}