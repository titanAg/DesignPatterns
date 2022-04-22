package patterns.decorator0;
public class Car {
	String description;
	boolean exterior;
	boolean designPackage;
	boolean navigationPlus;

	public double cost() {
		double costOfFeatures = 0.;
		if (hasExterior()) {
			costOfFeatures += 1400.;
		}
		if (hasDesignPackage()) {
			costOfFeatures += 5950.;
		}
		if (hasNavigationPlus()) {
			costOfFeatures += 3500.;
		}
		return costOfFeatures;
	}

	public String getDescription() {
		return description;
	};

	boolean hasExterior() {
		return exterior;
	}

	boolean hasDesignPackage() {
		return designPackage;
	}

	boolean hasNavigationPlus() {
		return navigationPlus;
	}

	void setExterior(boolean exterior) {
		this.exterior = exterior;
	}

	void setDesignPackage(boolean designPackage) {
		this.designPackage = designPackage;
	}

	void setNavigationPlus(boolean navigationPlus) {
		this.navigationPlus = navigationPlus;
	}
}
