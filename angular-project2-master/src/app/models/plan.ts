export class Plan {
	planId: number;
	planName: string;
	planPrice: number;
	planNumLines: number;
	customerId: number;

	constructor(planName = "", planPrice = 0, planNumLines = 0, customerId = 0, planId?: number) {
		this.planId = planId || 0;
		this.planName = planName;
		this.planPrice = planPrice;
		this.planNumLines = planNumLines;
		this.customerId = customerId;
	}

}