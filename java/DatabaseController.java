package greenlight;

public abstract class DatabaseController {

	public abstract boolean insert(String table, String[] columns, String[] values);
}
