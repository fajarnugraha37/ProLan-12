package packageHemat;

public class dataBuku{
	
	private int	   noBuku, jumBuku;
	private String judulBuku;
	
	public dataBuku(int noBuku, String judulBuku, int jumbuku){
		this.noBuku    = noBuku;
		this.judulBuku = judulBuku;
		this.jumBuku   = jumBuku;
	}

	public int    getNoBuku() {
		return noBuku;
	}

	public String getJudulBuku() {
		return judulBuku;
	}

	public int    getJumBuku() {
		return jumBuku;
	}
	
	
}
