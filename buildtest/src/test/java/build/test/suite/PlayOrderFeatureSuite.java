package build.test.suite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import build.test.order.TestOrderService;
import build.test.payment.TestPaymentService;
import build.test.user.TestUserService;

@RunWith(JUnitPlatform.class)
@SelectClasses({TestUserService.class, TestOrderService.class, TestPaymentService.class})
public class PlayOrderFeatureSuite {
}
