CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE SCHEMA IF NOT EXISTS event_services;

CREATE TABLE event_services.tb_companies (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(100) UNIQUE NOT NULL,
    cnpj VARCHAR(100) UNIQUE NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    phone_number VARCHAR(100) UNIQUE NOT NULL,

    created_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW()
);

CREATE TABLE event_services.tb_user_profiles (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(150) NOT NULL,
    cpf VARCHAR(100) UNIQUE NOT NULL,
    phone_number VARCHAR(100) UNIQUE NOT NULL,
    gender VARCHAR(80) NOT NULL DEFAULT 'NON_BINARY' CHECK (gender IN ('MALE', 'FEMALE', 'NON_BINARY')),
    date_of_birth DATE NOT NULL,

    created_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW()
);

CREATE TABLE event_services.tb_event_seasons (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    city VARCHAR(100) NOT NULL,
    cep VARCHAR(100) NOT NULL,
    address VARCHAR(150) NOT NULL,
    address_number BIGINT NOT NULL,
    ticket_price DECIMAL NOT NULL,
    start_time TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    end_time TIMESTAMP WITHOUT TIME ZONE NOT NULL,

    created_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW()
);

CREATE TABLE event_services.tb_event_activities (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(100) NOT NULL,
    type VARCHAR(80) NOT NULL DEFAULT 'COURSE' CHECK (type IN ('COURSE', 'LECTURE', 'COMPETITION', 'BOOTH')),
    description VARCHAR(300) NOT NULL,
    activite_event_time TIMESTAMP WITHOUT TIME ZONE NOT NULL,

    created_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),

    user_profile_id UUID NOT NULL,
    event_id UUID NOT NULL,

    FOREIGN KEY (user_profile_id) REFERENCES event_services.tb_user_profiles(id) ON DELETE CASCADE,
    FOREIGN KEY (event_id) REFERENCES event_services.tb_event_seasons(id) ON DELETE CASCADE
);

CREATE TABLE event_services.tb_sponsorships (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    amount DECIMAL NOT NULL,
    logo_link VARCHAR(800) NOT NULL,
    site_link VARCHAR(800) NOT NULL,
    representative_full_name VARCHAR(150) NOT NULL,
    type VARCHAR(80) NOT NULL DEFAULT 'BRONZE' CHECK (type IN ('GOLD', 'SILVER', 'BRONZE')),

    created_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),

    company_id UUID NOT NULL,
    event_id UUID NOT NULL,

    FOREIGN KEY (company_id) REFERENCES event_services.tb_companies(id) ON DELETE CASCADE,
    FOREIGN KEY (event_id) REFERENCES event_services.tb_event_seasons(id) ON DELETE CASCADE
);
