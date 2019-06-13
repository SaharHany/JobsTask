package com.sahar.jobfinder.Model;

public class Job
{
    private String company_logo;

    private String how_to_apply;

    private String created_at;

    private String description;

    private String company;

    private String company_url;

    private String location;

    private String id;

    private String type;

    private String title;

    private String url;

    public String getCompany_logo ()
    {
        return company_logo;
    }

    public void setCompany_logo (String company_logo)
    {
        this.company_logo = company_logo;
    }

    public String getHow_to_apply ()
    {
        return how_to_apply;
    }

    public void setHow_to_apply (String how_to_apply)
    {
        this.how_to_apply = how_to_apply;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getCompany ()
    {
        return company;
    }

    public void setCompany (String company)
    {
        this.company = company;
    }

    public String getCompany_url ()
    {
        return company_url;
    }

    public void setCompany_url (String company_url)
    {
        this.company_url = company_url;
    }

    public String getLocation ()
    {
        return location;
    }

    public void setLocation (String location)
    {
        this.location = location;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [company_logo = "+company_logo+", how_to_apply = "+how_to_apply+", created_at = "+created_at+", description = "+description+", company = "+company+", company_url = "+company_url+", location = "+location+", id = "+id+", type = "+type+", title = "+title+", url = "+url+"]";
    }
}