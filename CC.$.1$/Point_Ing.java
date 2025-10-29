package CC.$.Q$;

import java.util.Arrays;
import java.util.List;
import static java.lang.System.out;

public class Point_Ing<In> implements Point$<In>
{
	public List<Point$<In>> List;
	@Override
	public void Point$(In In)
	{
		for(Point$<In> P:List)
		{P.Point$(In);}
	}

	public Point_Ing(List<Point$<In>> List)
	{
		out.println("Print_Ing");

		this.List=List;
	}
		public Point_Ing(Point$<In>... List)
		{this(Arrays.asList(List));}
	public Point_Ing()
	{}
}