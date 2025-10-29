package CC.$.Q$;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

public interface Int$
	extends Num$
{
//	Clas_Rap Class=Init_StRt_Nd(Int$.class,
//		Clas_Rap.class
//	);/*Dep done*/

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Int$(int In);
//		@Override @Finishd(Is_Finishd=true)
//		default int Int1$1(int In)
//		{
//			Int$(In);
//			return In;
//		}

	@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=false)
	default Runnable Bind(int ValU)
	{return ()->{Int$(ValU);};}
		@Override @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=false)
		default Runnable[] SIn_PAr()
		{return new Runnable[]{
			Bind(-1),
			Bind(1)};
		}
}