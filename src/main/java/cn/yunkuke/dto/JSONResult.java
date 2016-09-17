package cn.yunkuke.dto;

/**
 * @author zqb on 2016年9月17日
 */
public class JSONResult<T> {
	private boolean success;
	private T data;
	private String error;

	public JSONResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

	public JSONResult(boolean success,String error) {
        this.success = success;
        this.error = error;
    }

	@Override
	public String toString() {
		return "JSONResult{" + "success=" + success + ", data=" + data + ", error='" + error + '\'' + '}';
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
