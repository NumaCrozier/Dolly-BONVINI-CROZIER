package tetris.model;

/**
 * Class that represents the boxes into the game grid.
 * @author Numa
 *
 */
public class Box {

	private final Location boxLocation;

	private States state;

	private Tetriminos tetrimino;

	/**
	 * Constructor parameterized for Box class.
	 * @param position
	 */
	public Box(Location position) {
		this.boxLocation=position;
		this.state=States.EMPTY;
		this.tetrimino = null;
	}

	
	public Location getBoxLocation() 
	{
		return boxLocation;
	}

	
	public Tetriminos getTetrimino()
	{
		return tetrimino;
	}

	public void setTetrimino(Tetriminos tetrimino) 
	{
		this.tetrimino = tetrimino;
		this.state = States.PLAYED;  //TODO : Remettre PLACED � la place de PLAYED
	}
	
	public void setTetrimino(Tetriminos tetrimino, States state) 
	{
		this.tetrimino = tetrimino;
		this.state = state;  //TODO : Remettre PLACED � la place de PLAYED
	}

	public void setState(States state)
	{
		this.state = state;
	}

	public States getState()
	{
		return this.state;
	}
	
	public void removeTetrimino(States state){
		if(state == States.EMPTY)
			tetrimino = null;
		this.state = state;  //TODO : Remettre PLACED � la place de PLAYED
	}
	
	@Override
	public String toString() 
	{
		return "| "+this.state.toChar()+" ";
		
	}
}
