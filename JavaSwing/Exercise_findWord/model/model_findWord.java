package model;

public class model_findWord {
	private String document;
	private String keyWord;
	private String result;

	/**
	 * @param document
	 * @param keyWord
	 * @param result
	 */
	public model_findWord() {

		this.document = "";
		this.keyWord = "";
		this.result = "";
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String find() {
		int count = 0;
		int arrdess = 0;
		while (true) {
			int index = document.indexOf(keyWord, arrdess);
			if (index == -1) {
				//not find
				break;
			} else {
				//find it
				count++;
				arrdess = index + 1;
			}
		}
		result = "has " + count + " key worl " + this.keyWord;
		return result;
	}

}
