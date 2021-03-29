
public class ClientMain {
	public static void main(String[] args) {
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployeeName("Ram");
		leaveRequest.setNoOfDaysLeave(1);
		ILeaveRequestHandler sv = new Supervisor();
		ILeaveRequestHandler pm = new ProjectManager();
		ILeaveRequestHandler hr = new HR();
		sv.nextHandler(pm);
		pm.nextHandler(hr);
//		hr.nextHandler(null);
		sv.HandleRequest(leaveRequest);
	}
}

