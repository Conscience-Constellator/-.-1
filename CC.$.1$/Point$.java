package CC.$.Q$;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;

import java.util.List;

import static CC.COd.Neds_Ovrid.*;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

public interface Point$<Q$_Typ>
	extends Q$
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Point$.class,
		Clas_Rap.class);
	/*Dep done*/

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Point$(Q$_Typ Point);
		@Lin_DclAr @Neds_Ovrid(NEds=Neds_Ovrid.No) @Finishd(Is_Finishd=false)
		default Runnable To_Runbl(Q$_Typ In)
		{return ()->{Point$(In);};}
	@Lin_DclAr @Neds_Ovrid(NEds=Neds_Ovrid.No) @Finishd(Is_Finishd=true)
	default <Item_Typ extends Q$_Typ> void Point$_List(Item_Typ... List)
	{
		for(Item_Typ Item: List)
		{Point$(Item);}
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Neds_Ovrid.No) @Finishd(Is_Finishd=true)
	default void Point$_List(List<? extends Q$_Typ> List)
	{
		for(Q$_Typ Item: List)
		{Point$(Item);}
	}

	Point$ No=(In)->{};
		static <In> Point$<In> Get_No()
		{return (Point$<In>)No;}
}