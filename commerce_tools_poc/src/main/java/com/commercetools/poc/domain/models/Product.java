package com.commercetools.poc.domain.models;

import java.util.ArrayList;
import java.util.Map;

public class Product {
	public String id;
	public int version;
	public String versionModifiedAt;
	public int lastMessageSequenceNumber;
	public String createdAt;
	public String lastModifiedAt;
	public LastModifiedBy lastModifiedBy;
	public CreatedBy createdBy;
	public ProductType productType;
	public MasterData masterData;
	public String key;
	public TaxCategory taxCategory;
	public int lastVariantId;
	
	class Attribute {
		public String name;
		public Value value;
	}

	public class Category {
		public String typeId;
		public String id;
	}

	public class CategoryOrderHints {
	}

	public class CreatedBy {
		public boolean isPlatformClient;
		public User user;
	}

	public class Current {
		public Map<String, String> name;
		public Map<String, String> description;
		public ArrayList<Category> categories;
		public CategoryOrderHints categoryOrderHints;
		public Map<String, String> slug;
		public MasterVariant masterVariant;
		public ArrayList<Object> variants;
		public SearchKeywords searchKeywords;
	}

	
	public class Dimensions {
		public int w;
		public int h;
	}

	public class Image {
		public String url;
		public Dimensions dimensions;
	}

	

	public class LastModifiedBy {
		public boolean isPlatformClient;
		public User user;
	}

	public class MasterData {
		public Current current;
		public Staged staged;
		public boolean published;
		public boolean hasStagedChanges;
	}

	public class MasterVariant {
		public int id;
		public String sku;
		public ArrayList<Price> prices;
		public ArrayList<Image> images;
		public ArrayList<Attribute> attributes;
		public ArrayList<Object> assets;
	}

	

	public class Price {
		public String id;
		public Value value;
		public String country;
	}

	public class ProductType {
		public String typeId;
		public String id;
	}



	public class SearchKeywords {
	}

	
	public class Staged {
		public Map<String, String> name;
		public Map<String, String> description;
		public ArrayList<Category> categories;
		public CategoryOrderHints categoryOrderHints;
		public Map<String, String> slug;
		public MasterVariant masterVariant;
		public ArrayList<Object> variants;
		public SearchKeywords searchKeywords;
	}

	public class TaxCategory {
		public String typeId;
		public String id;
	}

	public class User {
		public String typeId;
		public String id;
	}

	public class Value {
		public String type;
		public String currencyCode;
		public int centAmount;
		public int fractionDigits;
		public String key;
		public Map<String, String> label;
	}

}

