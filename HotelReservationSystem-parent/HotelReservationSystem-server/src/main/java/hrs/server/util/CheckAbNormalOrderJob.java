package hrs.server.util;

import org.springframework.beans.factory.annotation.Autowired;

import hrs.server.Service.Interface.OrderService.OrderService;
/**
 * 
	QuartzJobBean 抽象类
	JobDetailBean
	SimpleTriggerBean
	CronTriggerBean
	SchedulerFactoryBean
	MethodInvokingDetailFactoryBean
 * @author NewSong
 *
 */
public class CheckAbNormalOrderJob  {
	@Autowired
	private OrderService service;
	
	public void execute(){
		service.checkAbNormalOrder();
	}
}
